package cyn.otto.item;

import cyn.otto.Otto;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup OTTO = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Otto.MOD_ID, "dash"),
            new FabricItemGroupBuilderImpl().displayName(Text.translatable("itemGroup.dash"))
                .icon(() -> new ItemStack(ModItems.ICE_OTTO)).entries((displayContext, entries) -> {
                    entries.add(ModItems.ICE_OTTO);
                    entries.add(Items.ICE);
                    entries.add(Blocks.PACKED_ICE);
                    entries.add(Blocks.BLUE_ICE);
                    }).build());
    public static void registerModItemGroup() {

    }
}
