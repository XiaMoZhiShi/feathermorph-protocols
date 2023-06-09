package xiamomc.morph.network.commands.S2C.set;

import xiamomc.morph.network.BasicServerHandler;
import xiamomc.morph.network.annotations.Environment;
import xiamomc.morph.network.annotations.EnvironmentType;
import xiamomc.morph.network.commands.S2C.S2CCommandNames;

public class S2CSetProfileCommand extends AbstractS2CSetCommand<String>
{
    public S2CSetProfileCommand(String nbtTag)
    {
        super(nbtTag);
    }

    @Override
    public String getBaseName()
    {
        return S2CCommandNames.SetProfile;
    }

    @Environment(EnvironmentType.CLIENT)
    @Override
    public void onCommand(BasicServerHandler<?> handler)
    {
        handler.onSetProfileCommand(this);
    }

    @Override
    public String buildCommand()
    {
        return super.buildCommand() + " " + this.getArgumentAt(0, "{}");
    }
}
