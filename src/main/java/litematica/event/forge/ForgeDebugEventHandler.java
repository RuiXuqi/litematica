package litematica.event.forge;

import litematica.Reference;
import litematica.render.DebugScreenMessages;
import malilib.util.game.wrap.GameWrap;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
public class ForgeDebugEventHandler
{
    @SubscribeEvent
    public static void onRenderDebugScreen(RenderGameOverlayEvent.Text event)
    {
        if (GameWrap.getOptions().showDebugInfo)
        {
            DebugScreenMessages.addDebugScreenMessages(event.getLeft());
        }
    }
}
