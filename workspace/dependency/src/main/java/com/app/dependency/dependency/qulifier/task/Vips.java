package com.app.dependency.dependency.qulifier.task;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
@Qualifier(value = "vips")
public class Vips implements Resturant {
    private int steak = Resturant.steak + 10000;

    @Override
    public boolean selfba() {
        return false;
    }


}
