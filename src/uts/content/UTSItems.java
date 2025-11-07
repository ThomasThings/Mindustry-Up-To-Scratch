package uts.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;

import static mindustry.content.Items.*;

public class UTSItems{
    public static Item
            stone, stoneBrick, crudeIron, ironIngot, crudeCopper, copperIngot, crudeLead, leadIngot;

    public static final Seq<Item> utsItems = new Seq<>(), utsOnlyItems = new Seq<>();

    public static void load(){
        stone = new Item("stone", Color.valueOf("72666d")){{
            hardness = 1;
            cost = 0.3f;
        }};
        stoneBrick = new Item("stone-brick", Color.valueOf("877a80")){{
            cost = 0.5f;
        }};
        crudeIron = new Item("crude-iron", Color.valueOf("7b818d")){{
            hardness = 1;
            cost = 0.3f;
        }};
        ironIngot = new Item("iron-ingot", Color.valueOf("b6bdcd")){{
            cost = 0.5f;
        }};
        crudeCopper = new Item("crude-copper", Color.valueOf("d9ac8f")){{
            hardness = 1;
            cost = 0.3f;
        }};
        copperIngot = new Item("copper-ingot", Color.valueOf("eec0a8")){{
            cost = 0.5f;
        }};
        crudeLead = new Item("crude-lead", Color.valueOf("9588b0")){{
            hardness = 1;
            cost = 0.3f;
        }};
        leadIngot = new Item("lead-ingot", Color.valueOf("a197c1")){{
            cost = 0.5f;
        }};


        utsItems.addAll(stone, stoneBrick, crudeIron, ironIngot, crudeCopper, copperIngot, crudeLead, leadIngot);

        utsOnlyItems.addAll(utsItems).removeAll(serpuloItems);
        utsOnlyItems.removeAll(erekirItems);
    }
}