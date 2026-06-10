package celestered.warriorkittiens.item;

import celestered.warriorkittiens.Warriorkittiens;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class modItems {
    public static final Item CATNIP = registerItem("catnip",Item::new);


    //registering item under our namespace
    //then applying properties in the following layer
    //setID does same as identifier but needs it in newer versions
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Warriorkittiens.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Warriorkittiens.MOD_ID, name)))));
    }

    public static void registermodItems(){
        Warriorkittiens.LOGGER.info(Warriorkittiens.MOD_ID+" Started Registering Mod Items");

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output->{
            output.accept(CATNIP);
        });
    }
}
