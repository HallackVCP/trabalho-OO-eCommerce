package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.repositories.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CidadeRepositoryImpl implements Repository<Cidade> {
    File tempDB = new File("cidade_temp_db.txt");
    File db = new File("cidade_db.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(db, true));
    BufferedReader br = new BufferedReader(new FileReader(db));
    BufferedWriter tempBW = new BufferedWriter(new FileWriter(tempDB));


    public CidadeRepositoryImpl() throws IOException {

    }

    @Override
    public List<Cidade> findAll() throws IOException {
        String data;
        List<Cidade> cidades = new ArrayList<>();
        while((data=br.readLine())!=null){
            List<String> cdData = Arrays.asList(data.split(","));
            String nome = cdData.get(0);
            String estado = cdData.get(1);
            Cidade cidade = new Cidade(nome, estado);
            cidades.add(cidade);
        }
        return cidades;
    }

    @Override
    public Cidade findByCod(String cod) throws IOException {
        String data;
        while((data = br.readLine())!=null){
            if(data.contains(cod)){
                List<String> cdData = Arrays.asList(data.split(","));
                String nome = cdData.get(0);
                String estado = cdData.get(1);
                Cidade cidade = new Cidade(nome, estado);
                return cidade;
            }
        }
        return null;
    }

    @Override
    public void save(Cidade obj) throws IOException {
        bw.write(obj.getNome()+","+obj.getEstado().getNome());
        bw.flush();
        bw.newLine();
        bw.close();
    }

    @Override
    public void update(Cidade obj) throws IOException {
        String data;
        while((data = br.readLine())!=null){
            if((data.contains(obj.getNome()))&&(data.contains(obj.getEstado().getNome()))){
                List<String> cdData = Arrays.asList(data.split(","));
                String nome = cdData.get(0);
                String estado = cdData.get(1);
                Cidade cidade = new Cidade(nome, estado);
                if(obj.equals(cidade)){
                    delete(cidade);
                    save(obj);
                }
            }
        }
    }

    @Override
    public void delete(Cidade obj) throws IOException {
        String data;
        while((data = br.readLine())!=null){
            if((data.contains(obj.getNome()))&&(data.contains(obj.getEstado().getNome()))){
                continue;
            }
            tempBW.write(data);
            tempBW.flush();
            tempBW.newLine();
        }
        br.close();
        tempBW.close();
        db.delete();
        tempDB.renameTo(db);
    }

    @Override
    public void deleteAll() throws IOException {
        String data = " ";
        while(br.readLine()!=null){
            tempBW.write(data);
            tempBW.flush();
            tempBW.newLine();
        }
        br.close();
        tempBW.close();
        db.delete();
        tempDB.renameTo(db);
    }


}
