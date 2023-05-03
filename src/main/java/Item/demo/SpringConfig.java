package Item.demo;

import Item.demo.repository.ItemRepository;
import Item.demo.repository.MemoryItemRepository;
import Item.demo.service.ItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
  @Bean
  public ItemService itemService(){
    return new ItemService(itemRepository());
  }

  @Bean
  public ItemRepository itemRepository(){
    return new MemoryItemRepository();
  }
}
