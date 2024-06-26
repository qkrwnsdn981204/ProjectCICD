package org.spring.e1i4TeamProjectCICD.shop.dto;

import lombok.*;
import org.spring.e1i4TeamProjectCICD.shop.entity.CartEntity;
import org.spring.e1i4TeamProjectCICD.shop.entity.ShopEntity;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CartShopListDto {

    private Long id;

    private CartEntity cartEntity;

    private ShopEntity shopEntity;

    private int count;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
