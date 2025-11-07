package uts.content;

import mindustry.content.Fx;
import mindustry.entities.effect.RadialEffect;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.draw.DrawMulti;
import mindustry.world.draw.DrawRegion;

import static mindustry.type.ItemStack.with;

public class UTSProduction{
    public static Block
            crudeFurnace;

    public static void load(){
        crudeFurnace = new GenericCrafter("crude-furnace"){{
            requirements(Category.crafting, with(UTSItems.stone, 15));

            outputItem = new ItemStack(UTSItems.stoneBrick, 1);
            craftTime = 30f;
            size = 2;
            hasPower = false;
            hasLiquids = false;
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumeItems(with(UTSItems.stone,3));
        }};
    }
}
