package Item.demo.repository;

import Item.demo.domain.Item;
import Item.demo.domain.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@RequiredArgsConstructor
public class JPAItemRepository implements ItemRepository{

  @PersistenceContext
  private final EntityManager em;
  @Override
  public List<Item> findAll() {
    List itemList = em.createQuery("select i from Item i",
                    Item.class).getResultList();
    System.out.println(itemList);
    return itemList;
  }

  @Override
  public Item save(Item item) {
    em.persist(item);
    return item;
  }

  @Override
  public Item findById(Long id) {
    return em.find(Item.class,id);
  }

  @Override
  public void update(Long id, ItemDto itemUpdate) {

  }
}
