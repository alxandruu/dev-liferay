package com.liferay.training.ultra.cron.example.configuration;

import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(
        category = "ultra-cron-example",
        scope = ExtendedObjectClassDefinition.Scope.SYSTEM
)
@Meta.OCD(id = "com.liferay.training.ultra.cron.example.configuration.UltraCronConfiguration",
        localization = "content/Language",
        name = "ultra-cron-example")
public interface UltraCronConfiguration {
    @Meta.AD(
            deflt = "false",
            required = false,
            name="Enable Cron"
    )
    public boolean UltraCronEnabled();

    @Meta.AD(
            deflt = "Hello World!",
            required = false,
            name = "Message"
    )
    public String UltraCronMessage();
}
