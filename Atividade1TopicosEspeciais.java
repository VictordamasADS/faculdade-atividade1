/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1topicosespeciais;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaod
 */
public class Atividade1TopicosEspeciais {

    private String nomeDoCarro;
    private String placa;
    
    public Atividade1TopicosEspeciais(String nomeDoCarro, String placa) {
        this.setPlaca(placa);
        this.setNomeDoCarro(nomeDoCarro);
    }

    public String getNomeDoCarro() {
        return nomeDoCarro;
    }

    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public static void main(String[] args) {
        
        List<Atividade1TopicosEspeciais> lista = new ArrayList<>();
        
        Atividade1TopicosEspeciais carro1 = new Atividade1TopicosEspeciais("Tesla Model Y", "PIE-2021");
        Atividade1TopicosEspeciais carro2 = new Atividade1TopicosEspeciais("Dodge RAM", "LAL-1971");
        
        lista.add(carro1);
        lista.add(carro2);
        
        for(int i=0; i < lista.size(); i++) {
            System.out.println("\nNome do carro: "+ lista.get(i).getNomeDoCarro() + "\nPlaca: " + lista.get(i).getPlaca());
        }
    }
    
}
