public interface RideInterface {
    void AddVisitorToQueue(Visitor visitor);
    void RemoveVisitorFromQueue(Visitor visitor);
    void PrintQueue();
    void RunOneCycle();  // Add this method
    void PrintRideHistory();
}
