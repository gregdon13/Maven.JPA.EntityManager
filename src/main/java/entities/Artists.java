package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artists {
    private @Id
    @GeneratedValue
    Integer artistId;
    private String name;
    private String instrumentation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrumentation() {
        return instrumentation;
    }

    public void setInstrumentation(String instrumentation) {
        this.instrumentation = instrumentation;
    }
}
