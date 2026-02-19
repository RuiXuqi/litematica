package litematica.config.factory;

import litematica.gui.ConfigScreen;
import malilib.gui.BaseScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import javax.annotation.Nullable;
import java.util.Set;

@SuppressWarnings("unused")
public class LitematicaGuiFactory implements IModGuiFactory
{
    @Override
    public void initialize(Minecraft minecraftInstance)
    {
    }

    @Override
    public boolean hasConfigGui()
    {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen currentScreen)
    {
        BaseScreen screen = ConfigScreen.create();
        screen.setParent(currentScreen);
        return screen;
    }

    @Nullable
    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }
}
