#!/usr/bin/env python3
# -*- coding: utf-8 -*-

def add_two_numbers(a, b):
    """Add two numbers and return the result"""
    return a + b

def add_multiple_numbers(*numbers):
    """Add multiple numbers using variable arguments"""
    return sum(numbers)

def add_from_list(number_list):
    """Add numbers from a list"""
    return sum(number_list)

def main():
    print("=== โปรแกรมบวกเลข (Python) ===")
    print("1. บวกเลขสองจำนวน")
    print("2. บวกเลขหลายจำนวน")
    print("3. ตัวอย่างการใช้งาน")
    
    try:
        choice = int(input("เลือกตัวเลือก (1-3): "))
        
        if choice == 1:
            num1 = float(input("ป้อนเลขที่ 1: "))
            num2 = float(input("ป้อนเลขที่ 2: "))
            result = add_two_numbers(num1, num2)
            print(f"ผลลัพธ์: {num1} + {num2} = {result}")
            
        elif choice == 2:
            count = int(input("จำนวนเลขที่ต้องการบวก: "))
            numbers = []
            
            for i in range(count):
                num = float(input(f"ป้อนเลขที่ {i + 1}: "))
                numbers.append(num)
            
            result = add_from_list(numbers)
            numbers_str = " + ".join(map(str, numbers))
            print(f"ผลลัพธ์: {numbers_str} = {result}")
            
        elif choice == 3:
            print("\n=== ตัวอย่างการใช้งาน ===")
            
            # บวกเลขสองจำนวน
            result1 = add_two_numbers(10, 20)
            print(f"10 + 20 = {result1}")
            
            # บวกเลขทศนิยม
            result2 = add_two_numbers(3.5, 2.8)
            print(f"3.5 + 2.8 = {result2}")
            
            # บวกเลขหลายจำนวน
            result3 = add_multiple_numbers(1, 2, 3, 4, 5)
            print(f"1 + 2 + 3 + 4 + 5 = {result3}")
            
            # บวกเลขจาก list
            sample_list = [10, 25, 30, 15]
            result4 = add_from_list(sample_list)
            print(f"10 + 25 + 30 + 15 = {result4}")
            
            # การใช้งานขั้นสูง
            large_numbers = [100, 200, 300, 400, 500]
            result5 = add_from_list(large_numbers)
            print(f"บวกเลขใหญ่: {' + '.join(map(str, large_numbers))} = {result5}")
            
        else:
            print("ตัวเลือกไม่ถูกต้อง!")
            
    except ValueError:
        print("กรุณาป้อนตัวเลขที่ถูกต้อง!")
    except Exception as e:
        print(f"เกิดข้อผิดพลาด: {e}")

if __name__ == "__main__":
    main()