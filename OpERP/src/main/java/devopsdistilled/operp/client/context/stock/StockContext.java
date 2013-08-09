package devopsdistilled.operp.client.context.stock;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ RmiContext.class, LocalContext.class })
public class StockContext {

}
