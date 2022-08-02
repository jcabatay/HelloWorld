package com.ascii274.solid.ofe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class GuitarNewWithFlames extends Guitar{

    private String flameColour;

    /**
     * super builder
     */
//    public GuitarNewWithFlames(String make, String model, int volume) {
//        super(make, model, volume);
//    }


}
