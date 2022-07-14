package com.justzhan.reggie.dto;

import com.justzhan.reggie.entity.Setmeal;
import com.justzhan.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
