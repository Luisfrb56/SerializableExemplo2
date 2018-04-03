
package serializableexemplo2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class OutputPropio extends ObjectOutputStream {
    
    public OutputPropio()throws IOException{
        
    }
    public OutputPropio(OutputStream ou)throws IOException{
        super(ou);
    }
    
    @Override
    protected void writeStreamHeader() throws IOException
    {
    }

    
}

