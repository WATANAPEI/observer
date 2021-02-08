export default function hello(x: number) {
    return (y: number) => {
        return x + y;
    };
}
