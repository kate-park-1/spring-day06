package Item.demo.service;

import Item.demo.domain.Item;
import Item.demo.domain.ItemDto;
import Item.demo.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {
  private final ItemRepository itemRepository;
  // 전체 상품 조회 , 상품등록(이름,가격,수량) , 상품조회(id), 상품 수정(id, 수정하고자하는 필드들)
  public List<Item> getItems() {
    return itemRepository.findAll();
  }

  public Item saveItem(ItemDto itemDto) {
    Item item = new Item(itemDto.getItemName(), itemDto.getPrice(), itemDto.getQuantity());
    return itemRepository.save(item);
  }

  public Item getItem(Long id) {
    return itemRepository.findById(id);
  }

  public void updateItem(Long id, ItemDto itemDto) {
    itemRepository.update(id, itemDto);
  }
}
