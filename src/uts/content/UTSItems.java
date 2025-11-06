package uts.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;

import static mindustry.content.Items.*;

public class UTSItems{
    public static Item
            iron;

    public static final Seq<Item> utsItems = new Seq<>(), utsOnlyItems = new Seq<>();

    public static void load(){
        iron = new Item("iron", Color.valueOf("a98b83")){{
            hardness = 1;
            cost = 0.8f;
        }};


        utsItems.addAll(iron);

        utsOnlyItems.addAll(utsItems).removeAll(serpuloItems);
        utsOnlyItems.removeAll(erekirItems);
    }
}