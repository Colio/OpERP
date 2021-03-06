package devopsdistilled.operp.client.context.items;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import devopsdistilled.operp.client.items.panes.details.BrandDetailsPane;
import devopsdistilled.operp.client.items.panes.details.CategoryDetailsPane;
import devopsdistilled.operp.client.items.panes.details.ItemDetailsPane;
import devopsdistilled.operp.client.items.panes.details.ManufacturerDetailsPane;
import devopsdistilled.operp.client.items.panes.details.ProductDetailsPane;

@Configuration
public class EntityDetailsContext {

	@Bean
	public ItemDetailsPane itemDetailsPane() {
		return new ItemDetailsPane();
	}

	@Bean
	public CategoryDetailsPane categoryDetailsPane() {
		return new CategoryDetailsPane();
	}

	@Bean
	public ProductDetailsPane productDetailsPane() {
		return new ProductDetailsPane();
	}

	@Bean
	public ManufacturerDetailsPane manufacturerDetailsPane() {
		return new ManufacturerDetailsPane();
	}

	@Bean
	public BrandDetailsPane brandDetailsPane() {
		return new BrandDetailsPane();
	}
}
