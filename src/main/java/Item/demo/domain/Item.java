package Item.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Item {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "item_name")
  private String itemName;
  private Integer price;
  private Integer quantity;

  public Item(){}

  public Item(String itemName, Integer price, Integer quantity){
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
  }
}
