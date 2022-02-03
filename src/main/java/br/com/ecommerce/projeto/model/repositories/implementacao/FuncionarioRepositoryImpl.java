package br.com.ecommerce.projeto.model.repositories.implementacao;

import br.com.ecommerce.projeto.model.domain.Cidade;
import br.com.ecommerce.projeto.model.domain.Funcionario;
import br.com.ecommerce.projeto.model.domain.enums.TipoFuncionario;
import br.com.ecommerce.projeto.model.repositories.FuncionarioRepository;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FuncionarioRepositoryImpl implements FuncionarioRepository {
    private Funcionario funcionario;
    File tempDB = new File("funcionario_temp_db.txt");
    File db = new File("funcionario_db.txt");
    BufferedWriter bw = new BufferedWriter(new FileWriter(db, true));
    BufferedReader br = new BufferedReader(new FileReader(db));
    BufferedWriter tempBW = new BufferedWriter(new FileWriter(tempDB));
    public FuncionarioRepositoryImpl(Funcionario funcionario) throws IOException {
        this.funcionario = funcionario;
    }

    @Override
    public List<Funcionario> buscarTodosFuncionarios() {
        return null;
    }

    @Override
    public Funcionario buscarFuncionarioPorCodigo(String matricula) throws IOException {
        String func;
        while((func = br.readLine())!=null){
            if(func.contains(matricula)){
                List<String> funcData = Arrays.asList(func.split(","));
                Integer mat = Integer.parseInt(funcData.get(0));
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
                //exception
            }
        }
        return null;
        //exception
    }

    @Override
    public void adicionarFuncionario(Funcionario funcionario) throws IOException {
        bw.write(funcionario.getMatricula()+", "+funcionario.getNome()+","
                +funcionario.getEmail()+","+","+ funcionario.getTipo()+","
                +funcionario.getCidade().getNome()+","+
                funcionario.getCidade().getEstado().getNome()+","+funcionario.getEmail()+
                ","+funcionario.getIdade());
        bw.flush();
        bw.newLine();
        bw.close();
    }

    @Override
    public void atualizarFuncionario(Funcionario oldFuncionario, Funcionario newFuncionario) throws IOException {
        String func;

        while((func = br.readLine())!=null){
            List<String> funcData = Arrays.asList(func.split(","));
            Integer mat = Integer.parseInt(funcData.get(0));
            String  tipoFuncionario= funcData.get(3);
            TipoFuncionario type = TipoFuncionario.valueOf(tipoFuncionario);
            Integer tipo = type.getCod();
            Double sal = Double.parseDouble(funcData.get(6));
            Integer idade = Integer.parseInt(funcData.get(7));
            double salario = sal;
            Cidade cidade = new Cidade(funcData.get(4), funcData.get(5));
            Funcionario funcionario1 =
                    new Funcionario(mat, funcData.get(1), funcData.get(2), tipo, cidade, salario, idade);
            if(funcionario1.equals(oldFuncionario)){
                funcionario1 = newFuncionario;
                adicionarFuncionario(funcionario1);
            }
        }
    }

    @Override
    public void deletarTodosFuncionarios() throws IOException {
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
    public void deletarFuncionarioPorCodigo(String matricula) throws IOException {
        String func;
        while((func = br.readLine())!=null){
            if(func.contains(matricula)){
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
