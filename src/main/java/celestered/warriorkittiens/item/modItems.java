package celestered.warriorkittiens.item;

import celestered.warriorkittiens.Warriorkittiens;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class modItems {

    //registering item under our namespace
    //then applying properties in the following layer
    //setID does same as identifier but needs it in newer versions
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Warriorkittiens.MOD_ID),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Warriorkittiens.MOD_ID, name)))));
    }

    public static void registermodItems(){
        Warriorkittiens.LOGGER.info(Warriorkittiens.MOD_ID+" Started Registering Mod Items");

    }
}
