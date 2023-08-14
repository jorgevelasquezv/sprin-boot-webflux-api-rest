package co.com.jorge.springboot.webflux.app.models.documents;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categorias")
public class Category {

    @Id
    @NotEmpty
    private String id;

    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category {" +
                "id: '" + id + '\'' +
                ", name: '" + name + '\'' +
                " }";
    }
}
