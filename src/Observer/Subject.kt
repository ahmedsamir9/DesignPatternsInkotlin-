package Observer

interface Subject {
        public fun registerObserver(observer: Observerr);
        public fun removeObserver(observer: Observerr)
        public fun notifyObservers()
    }