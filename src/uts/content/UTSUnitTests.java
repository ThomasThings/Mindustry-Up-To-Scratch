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

public class UTSUnitTests{
    public static Block
            testWall, testConstructor, testAssembler;

    public static void load(){
        testWall = new Wall("test-wall"){{
            requirements(Category.defense, with(UTSItems.ironIngot, 10));
            health = 150 * wallHealthMultiplier;
            armor = 10f;
            buildCostMultiplier = 8f;
        }};
        testConstructor = new Constructor("test-constructor"){{
            requirements(Category.units, with(UTSItems.ironIngot, 50));
            regionSuffix = "-dark";
            hasPower = true;
            buildSpeed = 0.6f;
            consumePower(2.5f);
            size = 3;
            //TODO expand this list
            filter = Seq.with(UTSUnitTests.testWall);
        }};
        testAssembler = new UnitAssembler("test-assembler"){{
            requirements(Category.units, with(UTSItems.ironIngot, 150));
            regionSuffix = "-dark";
            size = 5;
            plans.add(
                    new AssemblerUnitPlan(UnitTypes.vanquish, 60f * 50f, PayloadStack.list(UnitTypes.stell, 4, Blocks.tungstenWallLarge, 10))
            );
            areaSize = 13;
            researchCostMultiplier = 0.4f;

            consumePower(2.5f);
        }};
    }
}
