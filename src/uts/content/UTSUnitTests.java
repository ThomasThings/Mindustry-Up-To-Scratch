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
import mindustry.content.*;

import static mindustry.type.ItemStack.with;

public class UTSUnitTests{
    public static Block
            testWall, testConstructor, testAssembler, testReconstructor;

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
                    new AssemblerUnitPlan(UnitTypes.Dagger, 60f * 50f, PayloadStack.list(UTSUnitTests.testWall, 5))
            );
            areaSize = 13;
            researchCostMultiplier = 0.4f;

            consumePower(2.5f);
        }};
        testReconstructor = new Reconstructor("test-reconstructor"){{
            requirements(Category.units, with(Items.copper, 200, Items.lead, 120, Items.silicon, 90));

            size = 3;
            consumePower(3f);
            consumeItems(with(Items.silicon, 40, Items.graphite, 40));

            constructTime = 60f * 10f;

            upgrades.addAll(
                    new UnitType[]{UnitTypes.nova, UnitTypes.pulsar}
            );
        }};
    }
}
