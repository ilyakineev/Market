package com.Market.Market.Service;

import com.Market.Market.Repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductServiceTest extends AbstractProductRepositoryTest {

    ProductService productService;

    ProductRepository productRepositoryMock;

    public ProductServiceTest() {
        productRepositoryMock = mock(ProductRepository.class);
        this.productService = new ProductService(productRepositoryMock);
    }

    @Test
    void addProduct() {
        when(productRepositoryMock.addProduct(PRODUCT_ADD)).thenReturn(true);
        Assertions.assertEquals(productService.addProduct(PRODUCT_ADD), true);
    }

    @Test
    void getProductById() {
        when(productRepositoryMock.getProductById(99)).thenReturn(PRODUCT_GET_BY_ID);
        Assertions.assertEquals(productService.getProductById(99), PRODUCT_GET_BY_ID);
    }

    @Test
    void updateProduct() {
        when(productRepositoryMock.updateProduct(100,PRODUCT_UPDATE)).thenReturn(true);
        Assertions.assertEquals(productService.updateProduct(100,PRODUCT_UPDATE),true);
    }

    @Test
    void removeProductById() {
        when(productRepositoryMock.getProductById(101)).thenReturn(PRODUCT_REMOVE);
        when(productRepositoryMock.removeProduct(PRODUCT_REMOVE)).thenReturn(true);
        Assertions.assertEquals(productService.removeProductById(101), true);
    }

    @Test
    void getAllProduct() {
    }

    @Test
    void getValueProduct() {
    }
}