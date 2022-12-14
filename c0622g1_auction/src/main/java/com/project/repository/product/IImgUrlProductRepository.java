package com.project.repository.product;

import com.project.model.product.ImgUrlProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface IImgUrlProductRepository extends JpaRepository<ImgUrlProduct,Integer> {

    /**
     * Created by: SonPT
     * Date created: 13-12-2022
     * @pathVariable: ID
     * Function: find image of product by ID
     * @return List<ImgUrlProduct>
     */

    @Query(value = "SELECT * FROM img_url_product WHERE product_id=:id",nativeQuery=true)
    List<ImgUrlProduct> findImgByProductId(@Param("id") int id);

    /**
     * Created by: SonPT
     * Date created: 13-12-2022
     * @pathVariable: ID
     * Function: find image by ID
     * @return ImgUrlProduct
     */

    @Query(value="SELECT img.* FROM img_url_product img where img.id=:id ", nativeQuery = true)
    ImgUrlProduct findImageById(int id);

    /**
     * Created by: SonPT
     * Date created: 13-12-2022
     * @param: url, ID
     * Function: create Image of Product
     */

    @Modifying
    @Query(value="INSERT INTO img_url_product (url,product_id) VALUES (:url, :product_id)",nativeQuery = true)
    void createImgProduct(@Param("url") String url,
                        @Param("product_id") int id);
}
