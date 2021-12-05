package statemachine.typewriter;

public enum TypeWriterState {
    CAPSON {
        TypeWriterState next(){
            return TypeWriterState.CAPSOFF;
        }
    },

    CAPSOFF{
        TypeWriterState next(){
            return TypeWriterState.CAPSON;
        }
    };

    abstract TypeWriterState next();
}