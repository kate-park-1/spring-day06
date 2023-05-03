package Item.demo.repository;

import Item.demo.domain.Item;
import Item.demo.domain.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@PersistenceContext
@RequiredArgsConstructor
public class JPAItemRepository implements ItemRepository{
  private final EntityManager em;
  @Override
  public List<Item> findAll() {
    return null;
  }

  @Override
  public Item save(Item item) {

    em.persist();
    return null;
  }

  @Override
  public Item findById(Long id) {
    return null;
  }

  @Override
  public void update(Long id, ItemDto itemDto) {

  }
}
