import Foundation

@objc public class WebSocketServer: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
