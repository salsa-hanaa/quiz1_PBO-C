def calculate_angle(hours, minutes):
    # Hour hand: 30 deg/hour plus 0.5 deg/minute drift.
    # Minute hand: 6 deg/minute (360 deg / 60 min).
    # Angle is (hour - minute), normalized into [0, 359] since it is
    # measured counterclockwise from the hour hand to the minute hand.
    hour_angle = (hours % 12) * 30 + (minutes * 0.5)
    minute_angle = minutes * 6

    angle = hour_angle - minute_angle
    if angle < 0:
        angle += 360

    return int(angle)


if __name__ == "__main__":
    hours = int(input("Masukkan jam (0-23): "))
    minutes = int(input("Masukkan menit (0-59): "))

    print(f"Sudut antara jarum jam dan menit: {calculate_angle(hours, minutes)}")
