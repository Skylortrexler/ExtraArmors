package skylorbeck.extraarmor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class extraarmor_list {
    public static Item WOOD_HELMET = new ArmorItem(extraarmor_materials.WOOD, EquipmentSlotType.HEAD,(new Item.Properties()).group(ItemGroup.COMBAT)).setRegistryName("woodhelm");
}
