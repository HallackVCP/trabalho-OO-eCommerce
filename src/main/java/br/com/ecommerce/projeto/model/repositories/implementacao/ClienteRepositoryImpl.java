package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.domain.Cliente;
import br.com.ecommerce.projeto.model.domain.enums.TipoCliente;
import br.com.ecommerce.projeto.model.repositories.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClienteRepositoryImpl implements Repository<Cliente> {

    File tempDB = new File("cliente_temp_db.txt");
    File db = new File("cliente_db.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(db, true));
    BufferedReader br = new BufferedReader(new FileReader(db));
    BufferedWriter tempBW = new BufferedWriter(new FileWriter(tempDB));
    public ClienteRepositoryImpl() throws IOException {
    }


    @Override
    public List<Cliente> findAll() throws IOException {
        String data;

        List<Cliente> clientes = new ArrayList<>();
        while((data = br.readLine())!=null){
            List<String> cliData = Arrays.asList(data.split(","));
            String cpfOuCnpj = cliData.get(0);
            String nome = cliData.get(1);
            String email = cliData.get(2);
            String tipo = cliData.get(3);
            TipoCliente type = TipoCliente.valueOf(tipo);
            Cidade cidade = new Cidade(cliData.get(4), cliData.get(5));
            Cliente cliente = new Cliente(nome, email, cpfOuCnpj, type, cidade);
            clientes.add(cliente);
        }
        br.close();
        return clientes;
    }

    @Override
    public Cliente findByCod(String cod) throws IOException {
        String data;
        while((data = br.readLine())!=null){
            if(data.contains(cod)){
                List<String> cliData = Arrays.asList(data.split(","));
                String cpfOuCnpj = cliData.get(0);
                String nome = cliData.get(1);
                String email = cliData.get(2);
                String tipo = cliData.get(3);
                TipoCliente type = TipoCliente.valueOf(tipo);
                Cidade cidade = new Cidade(cliData.get(4), cliData.get(5));
                Cliente cliente = new Cliente(nome, email, cpfOuCnpj, type, cidade);
                return cliente;
            }
        }
        br.close();
        return null;
    }

    @Override
    public Cliente find(Cliente obj) throws IOException {
        String data;
        while((data = br.readLine())!=null){
            if(data.contains(obj.getCpfOuCnpj())){
                List<String> cliData = Arrays.asList(data.split(","));
                String cpfOuCnpj = cliData.get(0);
                String nome = cliData.get(1);
                String email = cliData.get(2);
                String tipo = cliData.get(3);
                TipoCliente type = TipoCliente.valueOf(tipo);
                Cidade cidade = new Cidade(cliData.get(4), cliData.get(5));
                Cliente cliente = new Cliente(nome, email, cpfOuCnpj, type, cidade);
                if(cliente.equals(obj)){
                    return cliente;
                }
            }
        }
        br.close();
        return null;
    }

    @Override
    public void save(Cliente obj) throws IOException {
        bw.write(obj.getCpfOuCnpj()+", "+obj.getNome()+","
                +obj.getEmail()+","+obj.getTipo()+","+
                obj.getCidade().getNome()+","+obj.getCidade().getEstado().getNome());
        bw.flush();
        bw.newLine();
        bw.close();
    }

    @Override
    public void update(Cliente obj) throws IOException{
        String data;
        while((data = br.readLine())!=null){
            if(data.contains(obj.getCpfOuCnpj())){
                List<String> cliData = Arrays.asList(data.split(","));
                String cpfOuCnpj = cliData.get(0);
                String nome = cliData.get(1);
                String email = cliData.get(2);
                String tipo = cliData.get(3);
                TipoCliente type = TipoCliente.valueOf(tipo);
                Cidade cidade = new Cidade(cliData.get(4), cliData.get(5));
                Cliente cliente = new Cliente(nome, email, cpfOuCnpj, type, cidade);
                if(cliente.equals(obj)){
                    delete(cliente);
                    save(obj);
                }
            }
        }
        br.close();
    }

    @Override
    public void delete(Cliente obj) throws IOException{
        String data;
        while((data = br.readLine())!=null){
            if(data.contains(obj.getCpfOuCnpj())){
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
    public void deleteAll() throws IOException{
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
