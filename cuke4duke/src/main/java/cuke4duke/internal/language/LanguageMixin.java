package cuke4duke.internal.language;

import org.jruby.runtime.builtin.IRubyObject;

import java.util.List;

public interface LanguageMixin {
    void add_hook(String phase, Hook hook);
    IRubyObject create_step_match(StepDefinition step_definition, String step_name, String formatted_step_name, List<StepArgument> step_arguments);
}