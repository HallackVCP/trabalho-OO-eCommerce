package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.domain.Funcionario;
import br.com.ecommerce.projeto.model.domain.enums.TipoFuncionario;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FuncionarioRepositoryImpl implements Repository<Funcionario> {
    File tempDB = new File("funcionario_temp_db.txt");
    File db = new File("funcionario_db.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(db, true));
    BufferedReader br = new BufferedReader(new FileReader(db));
    BufferedWriter tempBW = new BufferedWriter(new FileWriter(tempDB));
    public FuncionarioRepositoryImpl() throws IOException {

    }




    @Override
    public Funcionario findByCod(String cod) throws IOException {
        String func;
        while((func = br.readLine())!=null){
            if(func.contains(cod)){
                List<String> funcData = Arrays.asList(func.split(","));
                String mat =(funcData.get(0));
                String  tipoFuncionario= funcData.get(3);
                TipoFuncionario type = TipoFuncionario.valueOf(tipoFuncionario);
                Integer tipo = type.getCod();
                Double sal = Double.parseDouble(funcData.get(6));
                Integer idade = Integer.parseInt(funcData.get(7));
                double salario = sal;
                Cidade cidade = new Cidade(funcData.get(4), funcData.get(5));
                Funcionario funcionario1 =
                        new Funcionario(mat, funcData.get(1), funcData.get(2), tipo, cidade, salario, idade);
                return funcionario1;
            }
            else{
                return null;

            }
        }
        return null;

    }

    @Override
    public void save(Funcionario obj) throws IOException {
        bw.write(obj.getMatricula()+", "+obj.getNome()+","
                +obj.getEmail()+","+","+ obj.getTipo()+","
                +obj.getCidade().getNome()+","+
                obj.getCidade().getEstado().getNome()+","+
                ","+obj.getIdade());
        bw.flush();
        bw.newLine();
        bw.close();
    }

    @Override
    public void update(Funcionario obj) throws IOException {
        String func;

        while((func = br.readLine())!=null){
            List<String> funcData = Arrays.asList(func.split(","));
            String mat = (funcData.get(0));
            String  tipoFuncionario= funcData.get(3);
            TipoFuncionario type = TipoFuncionario.valueOf(tipoFuncionario);
            Integer tipo = type.getCod();
            Double sal = Double.parseDouble(funcData.get(6));
            Integer idade = Integer.parseInt(funcData.get(7));
            double salario = sal;
            Cidade cidade = new Cidade(funcData.get(4), funcData.get(5));
            Funcionario funcionario1 =
                    new Funcionario(mat, funcData.get(1), funcData.get(2), tipo, cidade, salario, idade);
            if(funcionario1.equals(obj)){
                delete(funcionario1);
                save(obj);
            }
        }
    }

    @Override
    public void deleteAll() throws IOException {
        String func = " ";
        while(br.readLine()!=null){
            tempBW.write(func);
            tempBW.flush();
            tempBW.newLine();
        }
        br.close();
        tempBW.close();
        db.delete();
        tempDB.renameTo(db);
    }

    @Override
    public void delete(Funcionario obj) throws IOException {
        String func;
        while((func = br.readLine())!=null){
            if(func.contains(obj.getMatricula())){
                continue;
            }
            tempBW.write(func);
            tempBW.flush();
            tempBW.newLine();
        }
        br.close();
        tempBW.close();
        db.delete();
        tempDB.renameTo(db);
    }
}
