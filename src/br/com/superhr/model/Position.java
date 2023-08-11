package br.com.superhr.model;

public enum Position {
    ASSISTENT {
        @Override
        public Position getNextPosition() {
            return ANALIST;
        }
    },
    ANALIST {
        @Override
        public Position getNextPosition() {
            return ESPECIALIST;
        }
    },
    ESPECIALIST {
        @Override
        public Position getNextPosition() {
            return MANAGER;
        }
    },
    MANAGER {
        @Override
        public Position getNextPosition() {
            return MANAGER;
        }
    };

    public abstract Position getNextPosition();
}
