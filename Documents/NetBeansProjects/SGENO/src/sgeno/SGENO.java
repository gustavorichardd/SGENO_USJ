/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgeno;

import sgeno.Classes.Aluno;
import sgeno.Classes.TodosArrays;
import java.util.ArrayList;
import sgeno.Classes.Empresa;

/**
 *
 * @author VJM
 */
public class SGENO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Empresa e1 = new Empresa();
        Empresa e2 = new Empresa();
        Empresa e3 = new Empresa();
        
        a1.setMatrícula("51867745");
        a1.setNome("Ademir Carrasco Cruz");
        a1.setCurso("ADS");
        a1.setFase(2);
        a1.setSexo("M");
        a1.setEmail("AdemirCC@gmail.com");
        a1.setTelefone("(48)32458547");
        a1.setCelular("(48)984411515");
        
        
        a2.setMatrícula("95896035");
        a2.setNome("Foloncio Souza Ribeiro");
        a2.setCurso("ADM");
        a2.setFase(3);
        a2.setSexo("M");
        a2.setEmail("f.souza.r@hotmail.com");
        a2.setTelefone("(48)32140151");
        a2.setCelular("(48)984520151");
        
        a3.setMatrícula("15487595");
        a3.setNome("Valéria Valquíria Xemendex");
        a3.setCurso("CC");
        a3.setFase(6);
        a3.setSexo("F");
        a3.setEmail("valvalxem@hotmail.com");
        a3.setTelefone("(48)32144578");
        a3.setCelular("(48)984529696");
        
        a4.setMatrícula("54962158");
        a4.setNome("Joaquin Jesus Medeiros Rosa Silva");
        a4.setCurso("PDG");
        a4.setFase(1);
        a4.setSexo("M");
        a4.setTelefone("(48)32415487");
        
        
        a5.setMatrícula("46925176");
        a5.setNome("Cris Tereso de Calcutá");
        a5.setCurso("ADS");
        a5.setFase(1);
        a5.setSexo("M");
        a5.setEmail("cristeresocalcuta@outlook.com");
        a5.setTelefone("(48)34174562");
        a5.setCelular("(48)999999999");
        
        e1.setNome("CEI Renascer");
        e1.setTelefone("(48)32222222");
        e1.setEndereco("Rua tal, 455, Centro, Cidade - SC");
        e1.setEmail("creirenascer@gmail.com");
        e1.setResponsavel("Fulaninho");
        
        e2.setNome("Firma da Esquina");
        e2.setTelefone("(48)32445454");
        e2.setEndereco("Rua da esquina, 1455, Kobrasol, Cidade - SC");
        e2.setEmail("fesquina@gmail.com");
        e2.setResponsavel("Ciclano");
        
        e3.setNome("Padaria");
        e3.setTelefone("(48)34146666");
        e3.setEndereco("Rua do lado, 56465, Arredores, Cidade - SC");
        e3.setEmail("contato@padaria.com.br");
        e3.setResponsavel("Padeiro");
        
        TodosArrays.listaAluno.add(a1);
        TodosArrays.listaAluno.add(a2);
        TodosArrays.listaAluno.add(a3);
        TodosArrays.listaAluno.add(a4);
        TodosArrays.listaAluno.add(a5);
        TodosArrays.listaEmpresa.add(e1);
        TodosArrays.listaEmpresa.add(e2);
        TodosArrays.listaEmpresa.add(e3);
        
        new Inicial().setVisible(true);
    }
    
    
    
}
