package uts.content;

import arc.struct.Seq;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.payloads.PayloadConveyor;
import mindustry.world.blocks.units.UnitFactory;

import static mindustry.type.ItemStack.with;

public class XenUnitBlocks{
    public static Block
            testFactory;

    public static void load(){
        testFactory = new UnitFactory("test-factory"){{
            requirements(Category.units, with(UTSItems.ironIngot));
            health = 650;
            plans = Seq.with(
                    new UnitPlan(XenUnitTypes.serpence, 60f * 20, with(UTSItems.ironIngot, 25, Items.silicon, 2))
            );
            size = 2;
            consumePower(0.5f);
            squareSprite = false;
        }};
    }
}
