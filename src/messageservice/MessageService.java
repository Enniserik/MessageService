/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author eennis
 */
public class MessageService {
    
    private MessageReader reader;
    private MessageWriter writer;
    
    public MessageService(MessageReader reader, MessageWriter writer){
        this.reader = reader;
        this.writer = writer;
    }
    
    public void processMessage(){
        writer.outputMessage(reader.getMessage());
    }

    public MessageReader getReader() {
        return reader;
    }

    public void setReader(MessageReader reader) {
        this.reader = reader;
    }

    public MessageWriter getWriter() {
        return writer;
    }

    public void setWriter(MessageWriter writer) {
        this.writer = writer;
    }
    
    
    
}
