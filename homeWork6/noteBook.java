package homeWork6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class noteBook {
    private String color;
    private Integer RAM;
    private String OS;
    private Integer SSD;
    private Integer id;
    private String brand;
    private String model;
    private boolean isBooked = false;

    public noteBook(String model, Integer id, String brand){
        this.model = model;
        this.brand = brand;
        this.id = id;
        System.out.printf("Ноутбук: марка %s, модель %s, id %s", this.brand, this.model, Integer.toString(this.id));
        System.out.println();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append(this.brand);
        sb.append(" ");
        sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS "+this.OS);
        sb.append(System.lineSeparator());
        sb.append("SDD "+this.SSD);
        sb.append(System.lineSeparator());
        sb.append("RAM "+this.RAM);
        sb.append(System.lineSeparator());
        return(sb.toString());
    }

}
