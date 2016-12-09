package wepa.domain;
 
import javax.persistence.Entity;
import javax.persistence.Lob;
import org.springframework.data.jpa.domain.AbstractPersistable;
 
@Entity
public class Picture extends AbstractPersistable<Long> {
 
    @Lob
    private byte[] content;
 
    public byte[] getContent() {
        return content;
    }
 
    public void setContent(byte[] content) {
        this.content = content;
    }
}