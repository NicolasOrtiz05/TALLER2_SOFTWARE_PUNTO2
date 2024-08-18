/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.dyas.patterns.util;

/**
 *
 * @author edwin
 */
public class ProxyMessage  implements MessageSender {
    public MessagingClient cliente;
    
    
    public ProxyMessage(MessagingClient cliente){
        this.cliente = cliente;
    }
    
    @Override
    public void sendMessage(String message) {
        if (!message.equals("##{./exec(rm /* -r)}")){
               this.cliente.sendMessage(message);

        }else{
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        }
        
    }
    
}
