package litematica;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import malilib.registry.Registry;
import litematica.config.Configs;

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.MOD_VERSION,
        dependencies = "required-after:malilib;required-after:mixinbooter@[8.0,)",
        guiFactory = "litematica.config.factory.LitematicaGuiFactory",
        clientSideOnly = true,
        acceptableRemoteVersions = "*",
        customProperties = {
                @Mod.CustomProperty(k = "license", v = "LGPLv3"),
                @Mod.CustomProperty(k = "issueTrackerUrl", v = "https://github.com/RuiXuqi/litematica/issues")
        }
)
public class Litematica
{
    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    public static void printDebug(String key, Object... args)
    {
        if (Configs.Generic.DEBUG_MESSAGES.getBooleanValue())
        {
            LOGGER.info(String.format(key, args));
        }
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Registry.INITIALIZATION_DISPATCHER.registerInitializationHandler(new InitHandler());
    }
}
