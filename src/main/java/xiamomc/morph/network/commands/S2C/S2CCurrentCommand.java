package xiamomc.morph.network.commands.S2C;

import xiamomc.morph.network.BasicServerHandler;
import xiamomc.morph.network.annotations.Environment;
import xiamomc.morph.network.annotations.EnvironmentType;

public class S2CCurrentCommand extends AbstractS2CCommand<String>
{
    public S2CCurrentCommand(String identifier)
    {
        super(identifier);
    }

    public String getDisguiseIdentifier()
    {
        return getArgumentAt(0, "null");
    }

    @Override
    public String getBaseName()
    {
        return S2CCommandNames.Current;
    }
    @Environment(EnvironmentType.CLIENT)
    @Override
    public void onCommand(BasicServerHandler<?> handler)
    {
        handler.onCurrentCommand(this);
    }
}
