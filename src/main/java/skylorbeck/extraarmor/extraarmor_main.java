package skylorbeck.extraarmor;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class extraarmor_main {
    public extraarmor_main(){
        {
            MinecraftForge.EVENT_BUS.register(this);
        }
    }
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegEvents {
        @SubscribeEvent
        public static void onItemRegistery(RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
            );
        }
    }
}
