package uts;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import uts.content.*;

public class UTSMod extends Mod{

    @Override
    public void loadContent(){
        UTSItems.load();
        UTSProduction.load();
    }

}
