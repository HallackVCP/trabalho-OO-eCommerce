package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Produto;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ProdutoRepositoryImpl implements Repository<Produto> {
    File tempDB = new File("produto_temp_db.txt");
    File db = new File("produto_db.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(db, true));
    BufferedReader br = new BufferedReader(new FileReader(db));
    BufferedWriter tempBW = new BufferedWriter(new FileWriter(tempDB));


    public ProdutoRepositoryImpl() throws IOException {

    }



    @Override
    public Produto findByCod(String cod) throws IOException {
        String data;
        while((data = br.readLine())!=null){
            if(data.contains(cod)){
                List<String> prodData = Arrays.asList(data.split(","));
                String codProd = prodData.get(0);
                String nome = prodData.get(1);
                double preco = Double.parseDouble(prodData.get(2));
                int qtd = Integer.parseInt(prodData.get(3));
                Produto produto = new Produto(nome,codProd, preco, qtd);
                return produto;
            }
        }
        return null;
    }

    @Override
    public void save(Produto obj) throws IOException {
        bw.write(obj.getCodigoProduto()+", "+obj.getNome()+","
                +obj.getPreco()+","+obj.getQtd());
        bw.flush();
        bw.newLine();
        bw.close();
    }

    @Override
    public void update(Produto obj) throws IOException {
        String data;
        while((data = br.readLine())!=null){
            if(data.contains(obj.getCodigoProduto())){
                List<String> prodData = Arrays.asList(data.split(","));
                String codProd = prodData.get(0);
                String nome = prodData.get(1);
                double preco = Double.parseDouble(prodData.get(2));
                int qtd = Integer.parseInt(prodData.get(3));
                Produto produto = new Produto(nome,codProd, preco, qtd);
                if(obj.equals(produto)){
                    delete(produto);
                    save(obj);
                }
            }
        }
    }

    @Override
    public void delete(Produto obj) throws IOException {
        String data;
        while((data = br.readLine())!=null){
            if(data.contains(obj.getCodigoProduto())){
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
