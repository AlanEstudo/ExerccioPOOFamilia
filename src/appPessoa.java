/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class appPessoa {
    public static void main(String[] args) {
        Mae mae = new Mae("Marlene",40);
        Pai pai = new Pai("Dorival",50);
        Filho filho = new Filho ("Alan",31);
        
        System.out.println("--------Filho ----------------");
        System.out.println("Nome do Filho -- :" + filho.getNome());
        System.out.println("Nome do Filho -- :" + filho.getIdade());
        System.out.println("--------Mãe-------------------");
        System.out.println("Nome do Mãe ---- :" + mae.getNome());
        System.out.println("Nome do Mãe ---- :" + mae.getIdade());
        System.out.println("--------Pai ------------------");
        System.out.println("Nome do Pai ---- :" + pai.getNome());
        System.out.println("Nome do Pai ---- :" + pai.getIdade());        
    }
    
}
