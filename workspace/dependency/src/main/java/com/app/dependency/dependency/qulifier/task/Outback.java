package com.app.dependency.dependency.qulifier.task;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "outback")
@Primary
@Data
public class Outback implements Resturant {
   private int steak = Resturant.steak + 5000;

    @Override
    public boolean selfba() {
        return true;
    }


}
